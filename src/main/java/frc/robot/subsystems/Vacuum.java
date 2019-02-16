package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

//import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.SpeedControllerGroup;
//import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Vacuum extends Subsystem {
  // We have 4 Talon SRX motors (using CAN, NOT PWM), so we need to use TalonSRX
  // From Phoenix 3rd party software
  WPI_VictorSPX m_vacuum = new WPI_VictorSPX(0);
  boolean isOn = false;

  @Override
  public void initDefaultCommand() {
    m_vacuum.configFactoryDefault();
  }

  public void switchOnOrOff() {
    if(isOn) {
      isOn = false;
      m_vacuum.set(0.0);
    } else {
      isOn = true;
      //Start at 0.8; 
      m_vacuum.set(1.0);
    }
  }
}