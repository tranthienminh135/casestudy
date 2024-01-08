package views;

import common.exception.ExceptionHandler;
import views.customer.CustomerView;

public class MainView {

    private final CustomerView customerView = new CustomerView();

    public void renderView() {
        mainView();
    }

    private void mainView() {
        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("       HỆ THỐNG QUẢN LÝ QUÁN CÀ PHÊ       ");
            System.out.println("              THÔNG MINH                ");
            System.out.println("                ( (   ");
            System.out.println("                 ) )  ");
            System.out.println("               ........ ");
            System.out.println("               |      |] ");
            System.out.println("               \\      / ");
            System.out.println("                `----'  ");
            System.out.println("---------------------------------------");
            System.out.println("1. ★ Quản lý khách hàng ★");
            System.out.println("2. ★ Quản lý nhân viên ★");
            System.out.println("0. ✘ Thoát ✘");
            int choice = ExceptionHandler.checkForParseInt("lựa chọn của bạn");
            switch (choice) {
                case 1:
                    customerView.customerManagement();
                    break;
                case 0:
                    System.out.println("Bạn đã thoát khỏi hệ thống");
                    return;
                default:
                    System.out.println("Giá trị không hợp lệ!");
                    break;
            }
        }
    }
}
