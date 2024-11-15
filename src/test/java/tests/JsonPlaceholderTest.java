package tests;

import com.solvd.eduncan.methods.jsonplaceholder.*;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class JsonPlaceholderTest {

    @Test
    public void createPostTest() {
        CreatePostMethod createPost = new CreatePostMethod();
        createPost.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        createPost.callAPI();
        createPost.validateResponse();
    }

    @Test
    public void getPostTest() {
        GetPostMethod getPost = new GetPostMethod(1);
        getPost.expectResponseStatus(HttpResponseStatusType.OK_200);
        getPost.callAPI();
        getPost.validateResponse();
    }

    @Test
    public void updatePostTest() {
        UpdatePostMethod updatePost = new UpdatePostMethod(1);
        updatePost.expectResponseStatus(HttpResponseStatusType.OK_200);
        updatePost.callAPI();
        updatePost.validateResponse();
    }

    @Test
    public void deletePostTest() {
        DeletePostMethod deletePost = new DeletePostMethod(1);
        deletePost.expectResponseStatus(HttpResponseStatusType.OK_200);
        deletePost.callAPI();
    }
}