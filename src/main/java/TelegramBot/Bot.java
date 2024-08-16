package TelegramBot;

import com.fasterxml.jackson.databind.ext.SqlBlobSerializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {return "Ghost2005bot";}

    @Override
    public String getBotToken() {return "7148514782:AAFkEDipQnwGpIsJGzdn0EQ_1eJEGoQR5n0";}

    //El método onUpdateReceived(Update update) de la clase Bot se usa para manejar todas las actualizaciones que el
    // bot recibe.
    // Dependiendo del tipo de actualización, se toman diferentes acciones.

    @Override
    public void onUpdateReceived(Update update) {

        String nombre = update.getMessage().getFrom().getUserName();
        String apellido = update.getMessage().getFrom().getUserName();
        String nickname = update.getMessage().getFrom().getUserName();

        if (update.hasMessage() && update.getMessage().hasText()) {
            System.out.println("Hola" + nickname + "Tu nombre es" + nombre + "apellido" + apellido);
            String message_Text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            if (message_Text.toLowerCase().equals("HOLA COMO ESTAS MANIN"));{
                System.out.println("User id: " + chat_id + "Message Text: " + message_Text);
            }

        }
    } //termina clase
    public void sendText (Long who, String what){
        SendMessage sm = SendMessage.builder()
                .chatId(who.toString())
                .text(what).build();
        try {
            execute(sm);
        }catch (TelegramApiException e){
            throw new RuntimeException(e);
        }
    }
}
