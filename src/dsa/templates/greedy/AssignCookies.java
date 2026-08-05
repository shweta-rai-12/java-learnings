package dsa.templates.greedy;

import java.util.Arrays;

public class AssignCookies {

    /**
     * Assign cookies problem : It is a greedy Algorithm problem where
     * we have to assign cookies to children based on their greed factor
     * and the size of the cookie.
     * Children with greed factors
     * Cookies with sizes
     *  A child is satisfied if cookie_size >= greed factor.
     *  Each children can get only one cookie and each cookie is only used once.
     *  Goal : Find the maximum number of children that can be satisfied with the given cookies.
     */
    public static int assignCookies(int[] greedFactor, int[] cookies){
        int[] s_greed = Arrays.stream(greedFactor).sorted().toArray();
        int[] s_cookies = Arrays.stream(cookies).sorted().toArray();
        int m = s_cookies.length;
        int l = 0,r =0;
        while(l < m){
            if(s_greed[r] <= s_cookies[l]){
                r = r+1;
            }
            l++;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] greedFactor = {2,3,4,5,1};
        int[] cookies ={2,3,1,2,5,3};
        int max_child = assignCookies(greedFactor, cookies);
        System.out.println("Maximum number of children that can be satisfied: "+max_child);
    }
}
