package edu.sjsu.cmpe275.lab2;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/homepage")
public class HomepageController {
    @RequestMapping(method= RequestMethod.GET)
    public String get(@RequestParam(value="id", required=true) String id, Model model) {
        Homepage homepage = null;
        Session session = Application.getSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
             homepage =
                    (Homepage)session.get(Homepage.class, id);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

        model.addAttribute("homepage", homepage);
        return "homepage";
    }
}