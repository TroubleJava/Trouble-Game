package simplechat;

import java.io.*;

/**
 * This class overrides some of the methods defined in the abstract
 * superclass in order to give more functionality to the client.
 *

 */
public class ChatClient extends AbstractClient
{
  //Instance variables **********************************************
  
  /**
   * The interface type variable.  It allows the implementation of 
   * the display method in the client.
   */
    ChatIF clientUI; 

    Trouble game;
  //Constructors ****************************************************
  
  /**
   * Constructs an instance of the chat client.
   *
   * @param host The server to connect to.
   * @param port The port number to connect on.
   * @param clientUI The interface type variable.
   */
  
    public ChatClient(String host, int port, ChatIF clientUI) throws IOException 
    {
        super(host, port); //Call the superclass constructor
        this.clientUI = clientUI;
        openConnection();
    }

    public ChatClient(String host, int port, String userName, ChatIF clientUI) throws IOException 
    {
        super(host, port); //Call the superclass constructor
        this.clientUI = clientUI;
        openConnection();
        sendToServer("#join commons");
        sendToServer("#login " + userName);
    }
  //Instance methods ************************************************
    
  /**
   * This method handles all data that comes in from the server.
   *
   * @param msg The message from the server.
   */
    @Override
    public void handleMessageFromServer(Object msg) 
    {
        if(msg instanceof Trouble){
            Trouble tr = (Trouble)(msg);
            game = tr;
            //update board?
            ((GUIClientConsole)clientUI).displayBoard(tr);
            clientUI.display(String.valueOf(tr.objCurrentPlayer.strUserName) + "'s move!");
        }
        else{
            clientUI.display(msg.toString());
        }
    }
  /**
   * This method handles all data coming from the UI            
   *
   * @param message The message from the UI.    
   */
    public void handleMessageFromClientUI(String message)
    {
        if(message.charAt(0)=='#'){
            handleClientCommand(message);
        }
        else{
            try
            {
                sendToServer(message);
            }
            catch(IOException e)
            {
                clientUI.display
                ("Could not send message to server.  Terminating client.");
                quit();
            }
        }
    }
  
    public void handleClientCommand(String message)
    {
        if(message.startsWith("#getPort")){
            clientUI.display(String.valueOf(getPort()));
        }
        else if(message.startsWith("#setPort")){
            if(!isConnected())
                setPort(Integer.parseInt(message.split(" ")[1]));
            else
                clientUI.display("Please #logOff to change.");
        }
        else if(message.startsWith("#logOff")){
            try{
                closeConnection();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
        else if(message.startsWith("#sendTrouble")){
            try{
                int players = message.split(" ").length;
                Envelope e = new Envelope();
                if(players == 4){
                    String recipient1 = message.split(" ")[1];
                    String recipient2 = message.split(" ")[2];
                    String recipient3 = message.split(" ")[3];
                    e = new Envelope(recipient1, recipient2, recipient3, game);
                }
                else if(players == 3){
                    String recipient1 = message.split(" ")[1];
                    String recipient2 = message.split(" ")[2];
                    e = new Envelope(recipient1, recipient2, game);
                }
                else{
                    String recipient1 = message.split(" ")[1];                
                    e = new Envelope(recipient1, game);
                }
                sendToServer(e);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(message.startsWith("#endTurn")){
            try{
                sendToServer(game);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(message.startsWith("#roll")){
            int roll = Integer.parseInt(message.split(" ")[1]);
            game.setRollDie(roll);
        }
        else if(message.startsWith("#location")){
            int position = Integer.parseInt(message.split(" ")[1]);
            game.move(position);
            if(game.currentRoll == 6){
                try{
                    sendToServer(game);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        else if(message.startsWith("#logOn")){
            try{
                openConnection();
            }
            catch(IOException ioe){
                ioe.printStackTrace();
            }
        }
        else if(message.startsWith("#getHost")){
            clientUI.display(getHost());
        }
        else if(message.startsWith("#setHost")){
            if(!isConnected())
                setHost(message.split(" ")[1]);
            else
                clientUI.display("Please #logOff to change.");
        }
        else if(message.startsWith("#quit")){
            quit();
        }
        else{
            try{
                sendToServer(message);
            }
            catch(IOException ex){
                clientUI.display("Could not send message to server. Terminate");
                ex.printStackTrace();
                quit(); 
            }
        }
    }
  /**
   * This method terminates the client.
   */
    public void quit()
    {
        try
        {
            closeConnection();
        }
        catch(IOException e) {}
            System.exit(0);
    }
  
    @Override
    protected void connectionException(Exception exception){
        System.out.println("Server shutdown");
      //After implementing connection closed, call it here...
        connectionClosed();
    }
}
//End of ChatClient class