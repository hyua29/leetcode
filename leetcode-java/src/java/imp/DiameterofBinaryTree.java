package java.imp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class DiameterofBinaryTree {
    private int ans;

    public int diameterOfBinaryTree(String firstDate, String secondDate) {
        List a = new ArrayList();
        if (firstDate.equals(secondDate)) return 0;
        firstDate = firstDate.toLowerCase();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fDate = sdf.parse(firstDate.substring(1, firstDate.length() - 1));
            Date sDate = sdf.parse(secondDate.substring(1, secondDate.length() - 1));
            long diffInMillies = Math.abs(sDate.getTime() - fDate.getTime());
            int diff = (int) TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            return diff;
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public int find_best_match(String business_name, List<String> contacts_list) {
        // Write your code here
        business_name = business_name.toLowerCase();

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] contactArray1 = o1.split(",");
                String[] contactArray2 = o2.split(",");
                if (contactArray1[2].equals("YES")) return 1;
                return 0;
            }
        };
        Collections.sort(contacts_list, c);
        for (int i = 0; i < contacts_list.size(); i++) {
            String contact = contacts_list.get(i);
            String[] contactArray = contact.split(",");
            if (contact.contains(business_name)) return i;
        }
        System.out.println(contacts_list);
        DateFormat m_ISO8601Local = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//        m_ISO8601Local.parse("s");
        return -1;
    }

    static public void main(String[] avgs) {
        DiameterofBinaryTree d = new DiameterofBinaryTree();

        System.out.println(d.diameterOfBinaryTree("`01/01/2019`", "`02/01/2019`"));
    }
}