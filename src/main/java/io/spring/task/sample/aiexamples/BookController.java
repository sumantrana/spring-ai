package io.spring.task.sample.aiexamples;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/books")
public class BookController {

    private ChatClient chatClient;

    public BookController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/top10")
    void getTop10Books(@RequestParam(value = "subject", defaultValue = "it") String subject){

    }

}
