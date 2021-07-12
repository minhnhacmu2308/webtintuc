package com.example.controllers.admin;

import com.example.model.New;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
@RestController
public class AdminNewController {

    @Value("${file.upload-dir}")
    String FILE_DIRECTORY;
    @PostMapping("/upload")

    public ResponseEntity<Object> fileUpload(@RequestParam("File") MultipartFile file) throws IOException {

        File myFile = new File(FILE_DIRECTORY+file.getOriginalFilename());
        myFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(myFile);
        fos.write(file.getBytes());
        fos.close();
        return  new ResponseEntity<Object>("Thanh cong", HttpStatus.OK);
    }

}
