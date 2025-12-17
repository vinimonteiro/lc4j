import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

public class Main {

    public static void main(String[] args){
        final ChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();

        final String answer = model.chat("Say 'Hello World' in Portuguese");
        System.out.println(answer); // "Olá Mundo"
    }

}
