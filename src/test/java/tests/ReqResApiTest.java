package tests;

import com.solvd.eduncan.methods.reqres.DeleteUserMethod;
import com.solvd.eduncan.methods.reqres.GetUserMethod;
import com.solvd.eduncan.methods.reqres.PostUserMethod;
import com.solvd.eduncan.methods.reqres.PutUserMethod;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

public class ReqResApiTest implements IAbstractTest {

    @Test
    public void createUserTest() {
        PostUserMethod api = new PostUserMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test
    public void getUserTest() {
        GetUserMethod api = new GetUserMethod(2);
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse();
    }

    @Test
    public void updateUserTest() {
        PutUserMethod api = new PutUserMethod(2);
        api.expectResponseStatus(HttpResponseStatusType.OK_200);
        api.callAPI();
        api.validateResponse();
    }

    @Test
    public void deleteUserTest() {
        DeleteUserMethod api = new DeleteUserMethod(2);
        api.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        api.callAPI();
    }
}