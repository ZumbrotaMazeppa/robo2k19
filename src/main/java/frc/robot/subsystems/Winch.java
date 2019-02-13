package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Winch extends Subsystem {
  // We have 4 Talon SRX motors (using CAN, NOT PWM), so we need to use TalonSRX
  // From Phoenix 3rd party software
  WPI_TalonSRX m_Winch = new WPI_TalonSRX(5);

  @Override
  public void initDefaultCommand() {
    m_Winch.configFactoryDefault();
  }

  public void up() {
    m_Winch.set(0.0);
  }

  public void down() {
    m_Winch.set(0.0);
  }

  public void stop() {
    m_Winch.set(0.0);
  }
}