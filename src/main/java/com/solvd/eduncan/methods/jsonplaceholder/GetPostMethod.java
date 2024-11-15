package com.solvd.eduncan.methods.jsonplaceholder;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.http.HttpMethodType;

@Endpoint(url = "${base_url}/posts/${id}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/posts/_get/rs.json")
public class GetPostMethod extends AbstractApiMethodV2 {
    public GetPostMethod(int postId) {
        super(null, "api/posts/_get/rs.json", "api/posts/post.properties");
        replaceUrlPlaceholder("base_url", "https://jsonplaceholder.typicode.com");
        replaceUrlPlaceholder("id", String.valueOf(postId));
    }
}