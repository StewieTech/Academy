<h1> How to Install Git </h1>

Google Git and download Git to your computer

## Git Config 
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
```
---
Git Log
```
git log -> shows all the previous commit messages; press Q to quit
git checkout 2d9bd0e963658749441a6daf1f066fb265de0c18 can have look at a previous commit
git checkout master
git log --oneline
git revert ce4b3b1 -> goes back to a previous state
git log -p  -> shows all the changes that happened
git log --graph -> shows branch
git log --grep='example'
```
---
## Documentation Links
````
- **StringFormat**: [Java String.format Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...))

Here are some of the format specifiers and their meanings:

%s: Formats the argument as a sEtring.
%d: Formats the argument as a decimal integer.
%f: Formats the argument as a floating-point number.
%t: Formats the argument as a date or time.
%%: Outputs a literal percent (%) sign.
```
