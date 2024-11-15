package com.solvd.eduncan.methods.reqres;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.utils.config.Configuration;
import static com.zebrunner.carina.api.http.HttpMethodType.*;

@Endpoint(url = "${base_url}/users/${id}", methodType = PUT)
@RequestTemplatePath(path = "api/users/_put/rq.json")
@ResponseTemplatePath(path = "api/users/_put/rs.json")
public class PutUserMethod extends AbstractApiMethodV2 {
    public PutUserMethod(int userId) {
        super("api/users/_put/rq.json", "api/users/_put/rs.json", "api/users/user.properties");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("id", String.valueOf(userId));
    }
}
