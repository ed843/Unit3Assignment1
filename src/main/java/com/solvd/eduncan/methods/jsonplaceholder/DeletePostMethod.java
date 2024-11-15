package com.solvd.eduncan.methods.jsonplaceholder;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.http.HttpMethodType;

@Endpoint(url = "${base_url}/posts/${id}", methodType = HttpMethodType.DELETE)
public class DeletePostMethod extends AbstractApiMethodV2 {
    public DeletePostMethod(int postId) {
        super(null, null, "api/posts/post.properties");
        replaceUrlPlaceholder("base_url", "https://jsonplaceholder.typicode.com");
        replaceUrlPlaceholder("id", String.valueOf(postId));
    }
}