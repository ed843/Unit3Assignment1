package com.solvd.eduncan.methods.reqres;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.utils.config.Configuration;
import static com.zebrunner.carina.api.http.HttpMethodType.*;

@Endpoint(url = "${base_url}/users/${id}", methodType = GET)
@ResponseTemplatePath(path = "api/users/_get/rs.json")
public class GetUserMethod extends AbstractApiMethodV2 {
    public GetUserMethod(int userId) {
        super(null, "api/users/_get/rs.json", "api/users/user.properties");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("id", String.valueOf(userId));
    }
}