import java.io.*
import java.net.Socket

public fun handleClient(socket: Socket) {
    socket.use { // Ensures the socket is closed after handling
        val input = socket.getInputStream()
        val output = socket.getOutputStream()

        println("Client connected: ${socket.remoteSocketAddress}")

        // Read and print client data
        try {
            val reader = BufferedReader(InputStreamReader(input))
            val writer = PrintWriter(OutputStreamWriter(output), true)

            // Send initial server response (if required)
            writer.println("Hello! You are connected to the SOCKS5 Server.")

            var line: String?
            while (reader.readLine().also { line = it } != null) {
                println("Received from client: $line")
                // Echo the data back to the client (or implement SOCKS5 protocol logic here)
                writer.println("Server received: $line")
            }
        } catch (e: IOException) {
            println("Error handling client: ${e.message}")
        }

        println("Client disconnected: ${socket.remoteSocketAddress}")
    }
}