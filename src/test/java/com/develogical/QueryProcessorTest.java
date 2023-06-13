package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }

  @Test
  public void knowsName() throws Exception {
    assertThat(queryProcessor.process("What is your name?"), containsString("Micheal Scott"));
  }

  @Test
  public void plus() throws Exception {
    assertThat(queryProcessor.process("What is 27 plus 99?"), containsString("126"));
  }

  @Test
  public void largest() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 99, 15, 76?"), containsString("99"));
  }

  @Test
  public void squareandcube() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is both a square and a cube: 729, 2728, 792, 900, 1000, 4493, 44?"), containsString("729"));
  }
}
