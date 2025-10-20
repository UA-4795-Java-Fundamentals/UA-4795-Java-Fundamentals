package com.softserve.academy.module12;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAnalyzer {
    public static void main(String[] args) {
        String text = """
                Some emails: alice@mail.com, support@softserve.inc.ua,
                bob10@ukr.net, fake@email, hello.world@gmail.com, fake.email.gmail.com
                Please contact us!
                """;
        String regex = "\\b[A-Za-z0-9_.-]+@[A-Za-z.]+\\.[a-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> emails = new ArrayList<>();
        while (matcher.find()){
            emails.add(matcher.group());
        }
        System.out.println(emails.size());

        for(String email : emails){
            System.out.println(email);
        }

    }
}
