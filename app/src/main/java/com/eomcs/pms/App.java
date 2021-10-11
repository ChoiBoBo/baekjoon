package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

public class App {

  public static void main(String[] args) {

    BoardHandler boardHandler = new BoardHandler();
    MemberHandler memberHandler = new MemberHandler();
    ProjectHandler projectHandler = new ProjectHandler(memberHandler);
    TaskHandler taskHandler = new TaskHandler(memberHandler);

    MAIN_LOOP : while (true) {

      String input = null;

      System.out.println("[메인]");
      System.out.println("1. 게시판");
      System.out.println("2. 회원");
      System.out.println("3. 프로젝트");
      System.out.println("4. 작업");
      System.out.println("0. 종료");

      int menuNo = Prompt.inputInt("메인> ");

      if(menuNo == 0) {
        input = "quit";

      } else if(menuNo == 0) {
        input = "quit";

      } else if(menuNo == 1) {
        LOOP: while(true) {
          System.out.println("[메인/게시판]");
          System.out.println("1. 등록");
          System.out.println("2. 목록");
          System.out.println("3. 상세보기");
          System.out.println("4. 변경");
          System.out.println("5. 삭제");
          System.out.println("9. 이젠메뉴");

          menuNo = Prompt.inputInt("게시판> ");
          switch(menuNo) {
            case 1: input = "/board/add"; break LOOP;
            case 2: input = "/board/list"; break LOOP;
            case 3: input = "/board/detail"; break LOOP;
            case 4: input = "/board/update"; break LOOP;
            case 5: input = "/board/update"; break LOOP;
            case 0: continue MAIN_LOOP;
            default:
              System.out.println("무효한 메뉴 번호입니다.");
          }
          System.out.println();
        }
      } else if(menuNo == 2) {
        LOOP: while(true) {
          System.out.println("[메인/회원]");
          System.out.println("1. 등록");
          System.out.println("2. 목록");
          System.out.println("3. 상세보기");
          System.out.println("4. 변경");
          System.out.println("5. 삭제");
          System.out.println("0. 이전메뉴");

          menuNo = Prompt.inputInt("회원> ");
          switch(menuNo) {
            case 1: input = "/member/add"; break LOOP;
            case 2: input = "/member/list"; break LOOP;
            case 3: input = "/member/detail"; break LOOP;
            case 4: input = "/member/update"; break LOOP;
            case 5: input = "/member/delete"; break LOOP;
            case 0: continue MAIN_LOOP;
            default:
              System.out.println("무효한 메뉴 번호입니다.");
          }
          System.out.println();
        }
      } else if(menuNo == 4) {
        System.out.println("[메인/작업]");
        System.out.println("1. 등록");
        System.out.println("2. 목록");
        System.out.println("3. 상세보기");
        System.out.println("4. 변경");
        System.out.println("5. 삭제");
        System.out.println("0. 이전메뉴");

        menuNo = Prompt.inputInt("작업> ");
        switch(menuNo) {
          case 1: input = "/task/add"; break LOOP;
          case 2: input = "/task/list"; break LOOP;
          case 3: input = "/task/detail"; break LOOP;
          case 4: input = "/task/update"; break LOOP;
          case 5: input = "/task/delete"; break LOOP;
          case 0: continue MAIN_LOOP;
          default:
            System.out.println("무효한 메뉴 번호입니다.");
        }
        System.out.println();
      }
    } else {
      continue;
    }

    // app 04 할 차례
    if (input.equals("exit") || input.equals("quit")) {
      System.out.println("안녕!");
      break;
    } else if (input.equals("/member/add")) {
      memberHandler.add();

    } else if (input.equals("/member/list")) {
      memberHandler.list();

    } else if (input.equals("/member/detail")) {
      memberHandler.detail();

    } else if (input.equals("/member/update")) {
      memberHandler.update();

    } else if (input.equals("/member/delete")) {
      memberHandler.delete();

    }  else if (input.equals("/project/add")) {
      // add() 메서드가 사용할 의존 객체를 미리 주입했기 때문에
      // 이제 파라미터로 전달할 필요가 없다.
      //        projectHandler.add(memberHandler); // 이전 코드 
      projectHandler.add();

    }  else if (input.equals("/project/list")) {
      projectHandler.list();

    }  else if (input.equals("/project/detail")) {
      projectHandler.detail();

    }  else if (input.equals("/project/update")) {
      // update() 메서드가 사용할 의존 객체를 미리 주입했기 때문에
      // 이제 파라미터로 전달할 필요가 없다.
      //        projectHandler.update(memberHandler); // 이전 코드
      projectHandler.update();

    }  else if (input.equals("/project/delete")) {
      projectHandler.delete();

    }  else if (input.equals("/task/add")) {
      // add() 메서드가 사용할 의존 객체를 미리 주입했기 때문에
      // 이제 파라미터로 전달할 필요가 없다.
      //        taskHandler.add(memberHandler); // 이전 코드
      taskHandler.add();

    }  else if (input.equals("/task/list")) {
      taskHandler.list();

    }  else if (input.equals("/task/detail")) {
      taskHandler.detail();

    }  else if (input.equals("/task/update")) {
      // update() 메서드가 사용할 의존 객체를 미리 주입했기 때문에
      // 이제 파라미터로 전달할 필요가 없다.
      //        taskHandler.update(memberHandler); // 이전 코드
      taskHandler.update();

    }  else if (input.equals("/task/delete")) {
      taskHandler.delete();

    }  else if (input.equals("/board/add")) {
      boardHandler.add();

    }  else if (input.equals("/board/list")) {
      boardHandler.list();

    }  else if (input.equals("/board/detail")) {
      boardHandler.detail();

    }  else if (input.equals("/board/update")) {
      boardHandler.update();

    }  else if (input.equals("/board/delete")) {
      boardHandler.delete();

    } else {
      System.out.println("실행할 수 없는 명령입니다.");
    }
    System.out.println();
  }

  // Prompt 가 소유하고 관리하고 있는 자원을 닫으라고 명령한다. 
  Prompt.close();
}
}












