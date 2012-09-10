package org.tigergrab.rpncalc;

import static org.junit.Assert.assertEquals;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd() throws Exception {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(18);
		stack.push(6);

		Operator add = new Add();
		add.execute(stack);
		assertEquals("18 + 6 == 24", Integer.valueOf(24), stack.pop());
	}

	@Test
	public void testSub() throws Exception {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(18);
		stack.push(6);

		Operator sub = new Sub();
		sub.execute(stack);
		assertEquals("18 - 6 == 12", Integer.valueOf(12), stack.pop());

	}

	@Test
	public void testMul() throws Exception {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(18);
		stack.push(6);

		Operator mul = new Mul();
		mul.execute(stack);
		assertEquals("18 * 6 == 108", Integer.valueOf(108), stack.pop());
	}

	@Test
	public void testDiv() throws Exception {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(18);
		stack.push(6);

		Operator div = new Div();
		div.execute(stack);
		assertEquals("18 / 6 == 3", Integer.valueOf(3), stack.pop());
	}
}
