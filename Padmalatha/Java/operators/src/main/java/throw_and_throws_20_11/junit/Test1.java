package throw_and_throws_20_11.junit;

import org.junit.Test;

import throw_and_throws_20_11.CheckVoteEligiblity;

public class Test1 {

	CheckVoteEligiblity checkVoteEligiblity=new CheckVoteEligiblity();
	@Test
	public void run()
	{
		checkVoteEligiblity.checkEligibility();
	}
}
