package com.solvd.eduncan.methods.jsonplaceholder;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.http.HttpMethodType;

@Endpoint(url = "${base_url}/posts/${id}", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/posts/_put/rq.json")
@ResponseTemplatePath(path = "api/posts/_put/rs.json")
public class UpdatePostMethod extends AbstractApiMethodV2 {
    public UpdatePostMethod(int postId) {
        super("api/posts/_put/rq.json", "api/posts/_put/rs.json", "api/posts/post.properties");
        replaceUrlPlaceholder("base_url", "https://jsonplaceholder.typicode.com");
        replaceUrlPlaceholder("id", String.valueOf(postId));
    }
}