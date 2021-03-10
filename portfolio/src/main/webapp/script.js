async function showGreetings(button) {
  const responseFromServer = await fetch('/greetings');
  const greetings = await responseFromServer.json();
  const greetingContainer = document.getElementById('greeting-container');

  switch (Math.floor(Math.random() * 10)) {
    case 0:
      greetingContainer.innerText = greetings.greeting0;
      break;
    case 1:
      greetingContainer.innerText = greetings.greeting1;
      break;
    case 2:
      greetingContainer.innerText = greetings.greeting2;
      break;
    case 3:
      greetingContainer.innerText = greetings.greeting3;
      break;
    case 4:
      greetingContainer.innerText = greetings.greeting4;
      break;
    case 5:
      greetingContainer.innerText = greetings.greeting5;
      break;
    case 6:
      greetingContainer.innerText = greetings.greeting6;
      break;
    case 7:
      greetingContainer.innerText = greetings.greeting7;
      break;
    case 8:
      greetingContainer.innerText = greetings.greeting8;
      break;
    case 9:
      greetingContainer.innerText = greetings.greeting9;
      break;
    }
}
