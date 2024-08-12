object CaesarCipher {

  // Encryption function
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  // Decryption function
  def decrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base - shift + 26) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  // General cipher function
  def cipher(text: String, shift: Int, algorithm: (String, Int) => String): String = {
    algorithm(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    // Encrypting the plaintext
    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    // Decrypting the text
    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }
}
