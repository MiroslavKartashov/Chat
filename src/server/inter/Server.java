package server.inter;
import server.handler.ClientHandler;


public interface Server {
    int PORT = 3344;
    boolean isNickBusy(String nick);
    void broadcastMsg(String msg);
    void subscribe(ClientHandler client);
    void unsubscribe(ClientHandler client);
    AuthService getAuthService();
}
