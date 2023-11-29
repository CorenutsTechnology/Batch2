package Interface_Collection;

import java.io.FileNotFoundException;

import com.crnt.bean.UserDefineException;

public interface ExceptionHandling2_20 {
void checkedException() throws FileNotFoundException, Exception;
void userDefineException() throws UserDefineException;
void fromCatch() throws UserDefineException;
void nestedTryBlock() throws UserDefineException;
void reThrowFromCatch();
 void callerMethod();
// void callerClass();
}
