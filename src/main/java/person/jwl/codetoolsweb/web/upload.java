package person.jwl.codetoolsweb.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class upload {
    @RequestMapping(value = "/uploadload")
    public String load(){ return "upload"; }

    @RequestMapping(value = "/upload")
    public void upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request,HttpServletResponse response) throws IOException {
        String path = request.getSession().getServletContext().getRealPath("/");
        String fileName = file.getOriginalFilename();
        System.out.println(path);
        File targetFile = new File(path, fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.getWriter().write("{\"success\":true}");
    }
}
