def load_words(filename):
    with open(filename,"r") as file:
        text=file.read()
        words =[line.strip() for line in file]
        if "" not in words:
            words.append("")
        if "i" not in words:
            words.append("i")
        if "a" not in words:
            words.append("a")
        return words,text
    
words,text=load_words("words.txt")
print(text)
print(words)