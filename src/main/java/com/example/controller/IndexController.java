package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.entity.Products;
import com.example.controller.form.TestForm;

@Controller
public class IndexController {

    // 入力画面
    @RequestMapping("/index_mvc")
    public String index(@ModelAttribute("index_mvc") TestForm form, Model model) {
        // プルダウンの内容を作成
        // (実際はDaoを使ってDBから取得)
        List<Products> productList = new ArrayList<>();
        productList.add(new Products(101, "鉛筆", 50));
        productList.add(new Products(102, "消しゴム", 100));

        // プルダウンの内容をmodelにセット
        model.addAttribute("productList", productList);
        // 入力画面へ
        return "index_mvc";
    }

    // 結果画面
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(@ModelAttribute("index_mvc") TestForm form, Model model) {
        // 選択したidを取得
        int id = form.getProduct_id();
        

        // idを元に、userオブジェクトを作成
        // (実際は、DBから取得した値を使う)
        Products products = null;
        switch (id) {
        case 101:
            products = new Products(101, "鉛筆", 50);
            break;
        case 102:
        	products = new Products(102, "消しゴム", 100);
            break;
        }

        // userオブジェクトをmodelにセット
        model.addAttribute("name", form.getName());
        model.addAttribute("products", products);

        // 結果画面へ
        return "result";
    }

}

