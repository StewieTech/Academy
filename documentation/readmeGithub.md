<h1> How to Install Git </h1>

Google Git and download Git to your computer

### Git Config 
The configuration file is located at `.git/config`. There are global and local settings, including the default editor, default branch, and aliases.


Here are some commands to get you started:

```bash
git config --list
git config --global user.name "your name"
git config --global user.email "name@your email"

To set up Github as your Git provider, go to the website and follow the instructions. Here's some basic Git commands

git init to setup local folder to local git repository
git remote add origin https://github.com/StewieTech/Academy.git
git add -> adds to the staging area
git status -> checks what's in the staging area
git commit -> adds file to local git repository

```
---
### Git Commands
```
git diff -> shows changes
git diff -- cached -> shows changes in the staging area
git restore --staged .  -> If I have added some changes in the staging area but I no longer want them
git restore .-> discards all changes in the working directory
git push origin --delete <branch-name>
git branch -d <branch-name>
git reset --hard origin/<branch-name>

```
---
### Git Log
```
git log -> shows all the previous commit messages; press Q to quit
git checkout 2d9bd0e963658749441a6daf1f066fb265de0c18 can have look at a previous commit
git checkout master
git checkout . -> this also removes all of your changes
git log --oneline
git revert ce4b3b1 -> goes back to a previous state
git log -p  -> shows all the changes that happened
git log --graph -> shows branch
git log --grep='example'
```
### Git Branch
```
git branch - a
git branch - avv
git branch -m old-name new-name
git merge 
git fetch origin 
git fetch all -> both commands update to the latest changes

```
---
### Documentation Links
````
- **StringFormat**: [Java String.format Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...))

Here are some of the format specifiers and their meanings:

%s: Formats the argument as a sEtring.
%d: Formats the argument as a decimal integer.
%f: Formats the argument as a floating-point number.
%t: Formats the argument as a date or time.
%%: Outputs a literal percent (%) sign.
```
### Documentation Links
```
right click the project explorer, click import, browse folder to the git cloned respository. Then select the POM file. 

y: Stage this hunk (yes).
n: Do not stage this hunk (no).
q: Quit; do not stage this hunk or any of the remaining hunks.
a: Stage this hunk and all the remaining hunks in the file.
d: Do not stage this hunk or any of the remaining hunks in the file.
j: Leave this hunk undecided, see the next undecided hunk.
J: Leave this hunk undecided, see the next undecided hunk in the previous chunk.
g: Select a hunk to go to.
/: Search for a hunk matching the given regex.
s: Split the current hunk into smaller hunks.
e: Manually edit the current hunk.
p: Toggle the state of the line in the hunk between staged and not staged.
?: Print help.