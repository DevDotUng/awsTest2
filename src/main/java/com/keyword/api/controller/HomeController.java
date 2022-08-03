package com.keyword.api.controller;

import java.util.List;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keyword.api.entity.HomeResult;
import com.keyword.api.service.HomeService;

@RestController
@RequestMapping("/api/")
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@Autowired
	ServletContext ctx;
	
	@GetMapping(value = "home", produces = "application/json;charset=UTF-8")
	public ResponseEntity<List<HomeResult>> getHome(String category) {
		List<HomeResult> homeList;
		
		if (category == null || category == "")
			homeList = homeService.getHomeList();
		else 
			homeList = homeService.getHomeList(category);
		
		return ResponseEntity.status(HttpStatus.OK).body(homeList);
	}
	
//	@PostMapping(value = "home", produces = MediaType.MULTIPART_FORM_DATA_VALUE)
//	public void insert(@RequestParam("name") String name,
//			@RequestParam("category") String category,
//			@RequestParam("corperation") String corperation,
//			@RequestParam("icon") MultipartFile icon) throws IllegalStateException, IOException {
//		
//		String uuid = UUID.randomUUID().toString();
//		
//		long size = icon.getSize();
//		String fileName = uuid + icon.getOriginalFilename();
//		System.out.printf("fileName: %s, fileSize: %d\n", fileName, size);
//		
//		//ServletContext ctx = request.getServletContext();
//		String webPath = "/static/upload/icon";
//		String realPath = ctx.getRealPath(webPath);
//		System.out.printf("realPath: %s\n", realPath);
//		
//		File savePath = new File(realPath);
//		if (!savePath.exists())
//			savePath.mkdirs();
//		
//		realPath += File.separator + fileName;
//		File saveFile = new File(realPath);
//		
//		icon.transferTo(saveFile);
//		
//		AppInfo home = new AppInfo(name, fileName, category, corperation);
//		
//		homeService.insert(home);
//		
////		System.out.printf("name : %s, icon : %s, category : %s, corperation : %s\n",
////				name, icon, category, corperation);
//	}
}
