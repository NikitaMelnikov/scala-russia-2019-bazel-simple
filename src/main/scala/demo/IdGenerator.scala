package demo

import java.util.concurrent.atomic.AtomicInteger

class IdGenerator {
  private val seq = new AtomicInteger(0)

  def next(): Int = seq.incrementAndGet()
}
