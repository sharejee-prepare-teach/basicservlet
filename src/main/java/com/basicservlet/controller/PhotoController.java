package com.basicservlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/*
Create By: Ron Rith
Create Date: 12/21/2017
*/
@Controller
public class PhotoController extends BaseController{
    public static final String PARAM_LATESTPHOTO = "LATEST_PHOTO_PARAM";

    @RequestMapping(value = "/uploadPhoto", method = RequestMethod.GET)
    public String uploadPhotoForm(ModelMap model, HttpServletRequest request){
        model.addAttribute(PARAM_BASE_URL, getBaseURL(request));
        return "uploadPhoto";
    }

    @RequestMapping(value = "/uploadimgctlr", method = RequestMethod.POST)
    public String uploadImageCtlr(ModelMap model,
                                  HttpServletRequest request,
                                  @RequestParam MultipartFile file){
        String latestUploadPhoto = "";
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        File dir = new File(rootPath + File.separator + "img");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File serverFile = new File(dir.getAbsolutePath() + File.separator + file.getOriginalFilename());
        latestUploadPhoto = file.getOriginalFilename();

        //write uploaded image to disk
        try {
            try (InputStream is = file.getInputStream(); BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile))) {
                int i;
                while ((i = is.read()) != -1) {
                    stream.write(i);
                }
                stream.flush();
            }
        } catch (IOException e) {
            System.out.println("error : " + e.getMessage());
        }

        //send baseURL to jsp
        model.addAttribute(PARAM_BASE_URL, getBaseURL(request));
        //send photo name to jsp
        model.addAttribute(PARAM_LATESTPHOTO, latestUploadPhoto);
        return "uploadPhoto";
    }
}
