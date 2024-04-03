package demo.sudokugame.userinterface;

import demo.sudokugame.problemdomain.SudokuGame;

/**
 * Contract is really just another word for interface, which is another word for a Protocol.
 * All of these words mean: "something (a file in this case) which describes how one or more objects
 * may interact with each other without having to know too much about each other."
 * <p>
 * For example, let's say you order food to be delivered to your house. You expect the delivery person to show
 * (hopefully soon) to accept your payment and give you food. Both you and the driver are aware that this is how
 * you can interact with each other successfully. This must give you food, and you must pay the driver.
 * <p>
 * If I was to describe that Contract/Interface/Protocol/Abstraction in Java Code, it might look like:
 * interface FoodService {
 *     interface Customer {
 *         void acceptFood(Food food);
 *     }
 *     interface DeliveryPerson {
 *         void acceptPayment(Money money);
 *     }
 * }
 */
public interface IUserInterfaceContract {
    interface EventListener {
        void onSudokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View {
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(SudokuGame game);
        void showDialog(String message);
        void showError(String message);
    }
}
