// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random personal fact to the page.
 */
function addRandomFact() {
  const facts =
      ['I live in LA', 'Pronouns: he/him/his!', 'I attend CSULA', 'My favorite artist is King Krule'];

  // Pick a random greeting.
  const fact = facts[Math.floor(Math.random() * facts.length)];
  console.log(fact);
  // Add it to the page.
  const factContainer = document.getElementById('greeting-container');
  factContainer.innerText = greeting;
}
