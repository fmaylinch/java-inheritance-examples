package tech.bts.examples;

/**
 * An operation can produce a result.
 *
 * Note: an interface is similar to an abstract class with just abstract methods.
 */
public interface Operation {

    /** This method will be implemented by subclasses (concrete operations) */
    double getResult();
}
