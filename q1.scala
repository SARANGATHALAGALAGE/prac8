object CaesarCipher {

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

  def cipher(text: String, shift: Int, algorithm: (String, Int) => String): String = {
    algorithm(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "abcdefghij"
    val shift = 3

    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
  }
}
