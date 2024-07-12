package org.koreait.Controller;

import java.lang.reflect.Member;

public class MemberController {
    public abstract class Controller {

        protected static Member loginedMember = null;

        public abstract void doAction(String cmd, String actionMethodName);

        public boolean isLogined() {
            return loginedMember != null;
        }


        public void makeTestData() {

        }
    }
}
