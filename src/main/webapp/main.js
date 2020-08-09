"use strict";

(function()
{
    const audio = document.getElementById("audio");
    const alphabetContainer = document.getElementById("alphabet");
    const alphabet = "abcdefghijklmnopqrstuvwxyz";

    const lettersPerRow = 3;
    const rowCount = alphabet.length / lettersPerRow;
    for (let i = 0; i < rowCount; i++)
    {
        let row = document.createElement("div");
        let startIndex = i * lettersPerRow;
        let lastIndex = Math.min(
            startIndex + lettersPerRow,
            alphabet.length);

        for (let j = startIndex; j < lastIndex; j++)
        {
            createAlphabetEntry(alphabet[j], row);
        }

        alphabetContainer.appendChild(row);
    }


    /**
     * @letter - string
     */
    function createAlphabetEntry(letter, parent = null)
    {
        if (typeof letter != "string")
        {
            throw "Invalid type";
        }
        if (!/^[a-zA-Z]{1}$/.test(letter))
        {
            throw "Invalid letter";
        }
        letter = letter.toUpperCase();

        const button = document.createElement("button");
        button.textContent = letter;

        button.onclick = () => playAudio(letter);

        if (parent != null)
        {
            parent.appendChild(button);
        }
    }

    /**
     * @letter - string
     */
    function playAudio(letter)
    {
        audio.src = `sounds/${letter}-letter.wav`;

        audio.play();
    }

})();

