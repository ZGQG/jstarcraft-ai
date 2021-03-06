package com.jstarcraft.ai.math.algorithm.lsh;

import java.util.Random;

import com.jstarcraft.core.utility.RandomUtility;

public class ManhattanHashFamilyTestCase extends LshHashFamilyTestCase {

	@Override
	protected LshHashFamily getHashFamily(Random random, int dimensions) {
		return new ManhattanHashFamily(dimensions, 7);
	}

	@Override
	protected float getRandomData() {
		return RandomUtility.randomFloat(1F);
	}

}
