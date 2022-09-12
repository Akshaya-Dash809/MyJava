/*Write a program to accept a password from the user and throw 'Authentication
Failure' exception if the password is incorrect.  */

package lab_12Sep;
import java.util.*;

class PasswordException extends Exception
{
PasswordException(String msg)
{
super(msg);
}
} 

	