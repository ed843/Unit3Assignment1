package com.solvd.eduncan.methods.jsonplaceholder;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/posts", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/posts/_post/rq.json")
@ResponseTemplatePath(path = "api/posts/_post/rs.json")
public class CreatePostMethod extends AbstractApiMethodV2 {
    public CreatePostMethod() {
        super("api/posts/_post/rq.json", "api/posts/_post/rs.json", "api/posts/post.properties");
        replaceUrlPlaceholder("base_url", "https://jsonplaceholder.typicode.com");
    }
}