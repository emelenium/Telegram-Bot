import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update

class TelegramBotApplication
fun main(){
    ApiContextInitializer.init()
    TelegramBotsApi().registerBot(Bot())
}
class Bot: TelegramLongPollingBot(){
    override fun getBotToken() ="onlineOrenburgBot"

    override fun getBotUsername() ="1495728727:AAHIKsUU4gnW6RfSO64WXMwKu89ifwR6bYs"
    override fun onUpdateReceived(update: Update) {
        if(update.message.text == "/start"){
            execute(SendMessage().setChatId(update.message.chatId).setText("Hi!"))
        }
    }

}