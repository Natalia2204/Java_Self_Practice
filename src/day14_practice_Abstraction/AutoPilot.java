package day14_practice_Abstraction;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;
    String selfDrive();
}
/*
Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()
 */