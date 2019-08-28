package com.stackroute.succour.fileReaderAdapter.controller;

//import com.stackroute.succour.fileReaderAdapter.domain.NewsAPIResponseObject;
import com.stackroute.succour.fileReaderAdapter.domain.TwitterTimeline;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxOperator;

/**
 * Controller for Newsapi.org containing route to return data from
 * newapi.org as a Flux object
 */
@RestController
@RequestMapping("api/v1/")
public class AdapterController {


    private WebClient webClient = WebClient.create();

    /**
     * Queries newsapi.org for every news article containing the given keywords
     *
     * @return Flux<NewsAPIResponseObject> News articles as JSON
     */
    @GetMapping("getTweets")
    public Flux<TwitterTimeline> getTweets() {
//        Flux a = Flux.create();
        return webClient.get()
                //TODO edit endpoint to query for articles
                .uri("http://127.0.0.1:8081/data.json")
                .retrieve()
                .bodyToFlux(TwitterTimeline.class);
    }
}
