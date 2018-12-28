package fwcd.ktda.util

import fwcd.ktda.LOG
import java.io.InputStream

/** An input stream that terminates the application when closed */
class ExitingInputStream(
	private val delegate: InputStream,
	private val exiter: () -> Unit
) : InputStream() {
	override fun read(): Int = exitIfNegative { delegate.read() }
	
	override fun read(b: ByteArray): Int = exitIfNegative { delegate.read(b) }
	
	override fun read(b: ByteArray, off: Int, len: Int): Int = exitIfNegative { delegate.read(b, off, len) }
	
	private fun exitIfNegative(task: () -> Int): Int {
		val result = task()
		
		if (result < 0) {
			LOG.info("Exiting upon close of System.in")
			exiter()
		}
		
		return result
	}
}
