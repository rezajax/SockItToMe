package ir.rezajax



import handleClient
import java.io.*
import java.net.ServerSocket
import java.net.Socket


fun main() {
    val serverSocket = ServerSocket(1122)
    println("SOCKS5 Server is running on port ${serverSocket.localPort} ...")

    while (true) {
        val clientSocket = serverSocket.accept()
        println("Accepted a connection from ${clientSocket.remoteSocketAddress}")

        // Use a separate thread for each client to handle concurrency
        Thread {
            handleClient(clientSocket)
        }.start()
    }
}



