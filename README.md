---

# Morsecode Converter

This Java program converts text into Morse code using a predefined mapping of characters to Morse code sequences.

## Usage

1. **Clone the Repository:**
   ```
   git clone https://github.com/Ayush-Rana-1713/MorseCode
   ```

2. **Compile the Java Program:**
   ```
   javac Morsecode.java
   ```

3. **Run the Program:**
   ```
   java Morsecode
   ```

4. **Enter Input Text:**
   ```
   Enter the text you want to convert to Morse code when prompted.
   ```

5. **View Output:**
   ```
   The program will display the original text and its Morse code equivalent.
   ```

## Example

Given the input text:
```
ayush
```

The program will output:
```
Orginal Text: ayush
Morse Code: .- -.-- ..- ... ....
```

## Morse Code Mapping

The program uses a HashMap to map each character to its corresponding Morse code representation. Here's a snippet of the mapping used:

```java
private static final HashMap<Character, String> morsecodeMap = new HashMap<>();
// Mapping initialized in static block
```

---
