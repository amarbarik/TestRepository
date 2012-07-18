package com.reverside.springtest.action;

import com.reverside.springtest.dto.AddUserParameters;
import com.reverside.springtest.model.User;
import com.reverside.springtest.service.AddUserDataProvider;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

/*
wow , this is nice.
 */

@Controller
@Scope(value="request")
public class ListUserAction {

    private AddUserDataProvider addUserDataProvider;

    @RequestMapping(value = "/addUser.do", method = RequestMethod.GET)
    public String addUser(Model model){
            AddUserParameters addUserParameters=new AddUserParameters();
            initModel(model, addUserParameters, "Add User Details",null);
            return "addUser";
        }


    @RequestMapping(value = "/addUser.do", method = RequestMethod.POST)
    public String addUser(@Valid @ModelAttribute Model model,AddUserParameters addUserParameters,BindingResult result){
            if(result.hasErrors()){
                initModel(model,addUserParameters,"Error adding User",null);
                return "addUser";
            }
            List<User> users=addUserDataProvider.addUser(addUserParameters);
            initModel(model, addUserParameters, "Add User Details",users);
            return "addUser";
        }

    private void initModel(Model model, AddUserParameters parameters, String title,List<User> users) {
        model.addAttribute("title",title);
        model.addAttribute("addUserParameters", parameters);
        model.addAttribute("userList",users);
        model.addAttribute("requiresJavaScript",true);
    }

}
