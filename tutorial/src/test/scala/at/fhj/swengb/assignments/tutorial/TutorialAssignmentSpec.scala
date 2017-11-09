package at.fhj.swengb.assignments.tutorial

import org.scalatest.WordSpecLike

/**
  * This spec defines the behaviour of our class under test.
  */
class TutorialAssignmentSpec extends WordSpecLike {

  // execute this spec both in sbt and in IntelliJ.
  // Don't ever change the spec, you are only allowed to change the implementation
  // Goal is that all tests can be run successfully ('green' tests)
  "TutorialAssignment" should {
    "be completed successfully" in {
      assert(TutorialAssignment.attribute == 42)
    }
  }

}
